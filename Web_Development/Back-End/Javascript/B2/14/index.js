/*
const myButton = document.querySelector("#myButton");
const myImg = document.querySelector("#myImg");

myButton.addEventListener("click",() => {
    if(myImg.style.visibility == "hidden") {
        myImg.style.visibility == "visibility";
    }else{
        myImg.style.visibility == "hidden";
    }
})
*/
//using key presses
console.log('KEY PRESSES');
//window.addEventListener("keydown", event => console.log(event.key));

const myDiv = document.getElementById("aDiv");
window.addEventListener("keydown", move);
let x = 0;
let y = 0;

function move(event){
    switch(event.key){
        case "ArrowDown":
            y+=5;
            myDiv.style.top = y + "px";
            break;
        case "ArrowUp":
            y-=5;
            myDiv.style.top = y + "px";
            break;
        case "ArrowRight":
            x+=5;
            myDiv.style.right = x + "px";
            break;
        case "ArrowLeft":
            x-=5;
            myDiv.style.right = x + "px";
            break;
        default:
            break;        
    }
}