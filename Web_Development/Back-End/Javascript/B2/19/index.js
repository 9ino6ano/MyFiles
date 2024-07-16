//selecting buttons + labels
const playText = document.querySelector("#playerText");
const compText = document.querySelector("#computerText");
const resultText = document.querySelector("#resultText");
const choices = document.querySelectorAll(".choiceBtn");
//create 3 variables for player, compter, result
let player;
let computer;
let result;
//we loop throught the choices using forEaach
choices.forEach(button => button.addEventListener("click",() => {
    player = button.textContent;
    computerTurn();
    playText.textContent = `Player: ${player}`;
    compText.textContent = `Computer: ${computer}`;
    resultText.textContent = checkWinner();

}))

function computerTurn(){
    const randNum = Math.floor(Math.random() * 3) + 1;

    switch(randNum){
        case 1:
            computer = "Rock";
            break;
        case 2:
            computer = "Paper";
            break;
        case 3:
            computer = "Scissors";
            break;
        default:
            break;
    }

}
function checkWinner(){
    if(player == computer){
        return 'Draw';
    }else if(computer == "Rock"){
        return (player == "Paper") ? "You Win!!" : "You Lose";
    }else if(computer == "Paper"){
        return (player == "Scissors") ? "You Win!!" : "You Lose";
    }else if(computer == "Scissors"){
        return (player == "Rock") ? "You Win!!" : "You Lose";
    }else{
        return window.alert("Oops, something went wrong.")
    }
}