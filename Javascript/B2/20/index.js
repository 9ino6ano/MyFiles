const cells = document.querySelectorAll(".cell");
const statusText = document.querySelector("#statusText");
const resetBtn = document.querySelector("#restartBtn");

const winConditions = [
    [0,1,2],
    [3,4,5],
    [6,7,8],
    [0,3,6],
    [1,4,7],
    [2,5,8],
    [0,4,8],
    [2,4,6]
];
//an array of empty strings
let options = ["","","","","","","","",""];
let currentPlayer = "X";//keeping track of the current player
let running = false;
//when this program begins , init game
initGame();

//create the functions
function initGame(){
    cells.forEach(cell => cell.addEventListener("click",cellClicked));
    resetBtn.addEventListener("click",resetGame);
    statusText.textContent = `It's ${currentPlayer}'s turn.`;
    running = true;
}
function cellClicked(){
    const cellIndexNo = this.getAttribute("cellIndex");
    if(options[cellIndexNo] != ""|| !running){
        return;
    }
    UpdateCell(this,cellIndexNo);
    //changePlayer();
    checkWinner();
}
function UpdateCell(cell,index){
    //we updating the place holders
    options[index] = currentPlayer;
    cell.textContent = currentPlayer;
}
function changePlayer(){
    //currentPlayer = (currentPlayer == "X") ? "O" : "X";
    
    if(currentPlayer == "o"){
        currentPlayer = "x";
    }
    else{
        currentPlayer = "o";
    }
    statusText.textContent = `It's ${currentPlayer}'s turn.`
}
function checkWinner(){
    let roundWin = false;

    for(let i = 0; i < winConditions.length; i++){
        const condition = winConditions[i];
        const cellA = options[condition[0]];
        const cellB = options[condition[1]];
        const cellC = options[condition[2]];
        if(cellA == ""||cellB == ""||cellC == ""){
            continue;
        }
        if(cellA == cellB && cellB == cellC ){
            roundWin = true;
            break;
        }
        if(roundWin){
            statusText.textContent = `${currentPlayer} Win's!!!`;
            running = false;
        }else if(!options.includes("")){
            statusText.textContent = `It's a Draw...`;
            running = false;
        }
        else{
            changePlayer();
        }
    }
}  
function resetGame(){
    currentPlayer = "x";
    options = ["","","","","","","","",""];
    statusText.textContent = `It's ${currentPlayer}'s turn.`;
    cells.forEach(cell => cell.textContent = "");
    running = true;
}