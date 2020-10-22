import pygame

#General setup
pygame.init()
clock = pygame.time.Clock()

#Setting up the main window
screen_width = 800
screen_height = 600
screen = pygame.display.set_mode((screen_width,screen_height))
pygame.display.set_caption('Pong')

# Game Rectangles
ball1 = pygame.Rect(screen_width/2 - 15, screen_height/2 - 15, 20, 20)
#ball2 = pygame.Rect(screen_width/2 + 15, screen_height/2 - 15, 50, 50)
player = pygame.Rect(screen_height + 5, screen_height/2 - 305, 140, 20)
opponent = pygame.Rect(600, screen_height/2 + 285, 140, 20)
upperWall = pygame.Rect(screen_height - 600, screen_height/2 - 315, 800, 20)
lowerWall = pygame.Rect(screen_height - 600, screen_height/2 + 295, 800, 20)
rightWall = pygame.Rect(screen_height + 190, screen_height/2 - 300, 10, 600)
leftWall = pygame.Rect(screen_height - 600, screen_height/2 - 300, 10, 600)

bg_color = pygame.Color('grey12')
light_grey = (200,200,200)
yellow = (255,255,0)

ball_speed_y = 6
ball_speed_x = 6

while True:
    #handling input
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()

            sys.exit()

    ball1.x += ball_speed_x
    ball1.y += ball_speed_y

    """if ball1.top <= 0 or ball1.bottom >= screen_height:
        ball_speed_y *= -1
    if ball1.left <= 0 or ball1.right >= screen_width:
        ball_speed_x *= -1"""

    if ball1.colliderect(player) or ball1.colliderect(opponent):
        ball_speed_y *= -1
    if ball1.colliderect(rightWall) or ball1.colliderect(leftWall):
        ball_speed_x *= -1
    #if ball1.colliderect(upperWall) or ball1.colliderect(lowerWall):
    #    ball_speed_y *= -1


    #Visuals
    screen.fill(bg_color)
    pygame.draw.rect(screen,yellow, player)
    pygame.draw.rect(screen,yellow, opponent)
    pygame.draw.ellipse(screen, light_grey, ball1)
    pygame.draw.aaline(screen, light_grey, (screen_width/900,300), (screen_height*30,300))
    #pygame.draw.rect(screen, light_grey, upperWall)
    #pygame.draw.rect(screen, light_grey, lowerWall)
    pygame.draw.rect(screen, light_grey, rightWall)
    pygame.draw.rect(screen, light_grey, leftWall)

    #updating the window
    pygame.display.flip()
    clock.tick(60)
