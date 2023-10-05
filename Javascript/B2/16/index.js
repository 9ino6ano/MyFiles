//canvas api
//a means of drawing graphics, used for animations, games, data visualisation
console.log('1. Drawing a basic shape = lines');

let canvas = document.getElementById("myCanvas");
//to draw on canvas we need a canvas, a painting within a frame
let context = canvas.getContext("2d");
/*
//set the line width
context.strokeStyle = "Magenta";
context.lineWidth = 15;
//DRAWING LINES

context.beginPath();
context.moveTo(0,0);
context.lineTo(250,250);//250,250 | 500,500
context.lineTo(250,500);
context.moveTo(500,0);
context.lineTo(250,250);
context.stroke();
*/

console.log('2. Drawing a Triangle');
let canvas2 = document.getElementById("myCanvas2");
let context2 = canvas2.getContext("2d");
//setting stoke setting
context2.strokeStyle = "indigo";
context2.lineWidth = 10;
//drawing the triangle
/*
context2.beginPath();
context2.moveTo(250,0);//begin point
context2.lineTo(0,250);//right line
context2.lineTo(500,250);//bottomline
context2.lineTo(250,0);//left line
//fill option colors
context2.fillStyle = "cyan";
//border of fill color
//use the stroke method, together with the fill method
//fill the object
context2.fill();//colors the whole triangle
context2.stroke();
*/
//DRAWING A RECTANGLE
context2.strokeStyle = "cornsilk";
context2.fillStyle = "red";
context2.strokeRect(0,0,250,250);
context2.fillRect(0,0,250,250);
context2.fillStyle = "gold";
context2.strokeRect(0,250,250,250);
context2.fillRect(0,250,250,250);
context2.fillStyle = "black";
context2.strokeRect(250,0,250,250);
context2.fillRect(250,0,250,250);
context2.fillStyle = "green";
context2.strokeRect(250,250,250,250);
context2.fillRect(250,250,250,250);
//drawing a circle
//arc(x,y,startangle,endangle,counterclockwise = true/null)
context.fillStyle = "skyblue";
context.lineWidth = 7;
context.beginPath();
context.arc(250,250,200,0,2*Math.PI);
context.fill();
context.stroke();
//drawing text on the canvas
context.font = "50px MV Boli";
context.fillStyle = "cyan";
context.textAlign = "center";
context.fillText("9ino6ano",canvas.width / 2,canvas.height / 2);

