import pygame

#initializing the pygame
pygame.init()

#creating the screen
screen_width = 800
screen_height = 600
screen = pygame.display.set_mode((screen_width,screen_height))
#screen = pygame.display.set_mode((800, 600))

#Title and Icon
pygame.display.set_caption("The First Game, Part 1")
icon = pygame.image.load('ufo.png')
pygame.display.set_icon(icon)

#Player
player = pygame.Rect(screen_width/2-15, screen_height/2 + 200, 50, 50)
light_grey = (255,255,255)
#playerImg = pygame.image.load('player.png')
#playerX = 370
#playerY = 480

#def player():
#    screen.blit(playerImg, (playerX, playerY))

#Game Loop
running = True

#keeping the window openned or close
while running:
    # RGB - Red, Green, Blue
    screen.fill((0, 0, 0))
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    pygame.draw.rect(screen, light_grey, player)
    pygame.display.update()

