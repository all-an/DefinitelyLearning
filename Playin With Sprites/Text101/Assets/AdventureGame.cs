using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
public class AdventureGame : MonoBehaviour
{
    // Start is called before the first frame update
    [SerializeField] Text textComponent;

    void Start()
    {
        textComponent.text = ("When walking in the road, you see a chest in the middle of the road. " +
            "You open the chest or you keep going ?");
    }

    // Update is called once per frame
    void Update()
    {
        
    }
}
