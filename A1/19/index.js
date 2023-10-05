const answer = Math.floor(Math.random()*10+1);
let guessCount = 1;

document.getElementById('submitBtn').onclick = function(){
    let guess = document.getElementById('guessfield').value;

    if(guess == answer){
        alert(`${answer} is the #*Number*#. It took you ${guessCount} guesses.`);

    }else if(guess < answer){
        alert("Too Small..");
        guessCount+=1;
    }else{
        alert('Too Large!!');
        guessCount+=1;
    }
}