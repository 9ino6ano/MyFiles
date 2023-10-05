const btn = document.getElementById("myButton");
const myAnima = document.getElementById("myDiv");

btn.addEventListener("click",begin);

function begin(){
    let timerID = null;
    let x = 0;
    let y = 0;
    let degrees = 0;

    timerID = setInterval(frame,5);
    /*
    function frame(){
        if(x >= 200 || y >= 200){//x/y >= 200, else x/y+=1, myAnima.style.left/top = x/y + "px";
            clearInterval(timerID);
        }else{
            x += 1;
            y += 1;
            myAnima.style.left = x + "px";
            myAnima.style.top = y + "px";
        }
    }*/
    //you can also scale an object
    //let scaleX,scaleY = 1; if(scaleX >= 2) else scalex += 0.01; , transform = scale(+scale+)deg
    function frame(){
        if(x >= 200 || y >= 200){
           clearInterval(timerID); 
        }else{
            x += 1;
            y += 1;
            degrees += 15;
            myAnima.style.left = x + "px";
            myAnima.style.top = y + "px";
            myAnima.style.transform = "rotateZ("+degrees+"deg)";   
        }       
    }
}
