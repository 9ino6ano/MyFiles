//select all elements
const timeDisp = document.querySelector("#timeDisplay");
const startBtn = document.querySelector("#startBtn");
const resetBtn = document.querySelector("#resetBtn");
const pauseBtn = document.querySelector("#pauseBtn");

//declare variables 
let startTime = 0;
let elapsedTime = 0;
let currentTime = 0;
let paused = true;
let interValid;
let hours = 0;
let mins = 0;
let secs = 0;

//add listeners to the buttons
startBtn.addEventListener("click", () => {
    if(paused){
        paused = false;
        startTime = Date.now() - elapsedTime;
        interValid = setInterval(updateTime,1000);
    }

});
resetBtn.addEventListener("click", () => {
    paused = true;
    startTime = 0;
    elapsedTime = 0;
    currentTime = 0;
    interValid;
    hours = 0;
    mins = 0;
    secs = 0;
    //change time display to 00-00-00
    timeDisp.textContent = "00:00:00";
});
pauseBtn.addEventListener("click", () => {
    if(!paused){
        paused = true;
        elapsedTime = Date.now() - startTime;
        clearInterval(interValid);
    }
});

//function for updating the time
function updateTime(){
    elapsedTime = Date.now() - startTime;
    hours = Math.floor((elapsedTime / (1000 * 60 * 60)) % 60);
    mins = Math.floor((elapsedTime / (1000 * 60)) % 60);
    secs = Math.floor((elapsedTime/1000) % 60);
    
    secs = pad(secs);
    mins = pad(mins);
    hours = pad(hours);

    timeDisp.textContent = `${hours}:${mins}:${secs}`;
    
    function pad(unit){
        return(("0") + unit).length > 2 ? unit : "0" + unit;
    }
}