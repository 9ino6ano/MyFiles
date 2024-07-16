//if the retriving from element is too long , save it to a variable
//e.g myCheckBox = document.getElementById('mycheckbox');
/*
if(myCheckBox.checked){
...................
}
*/
/*
document.getElementById('mybutton').onclick = function(){
    if(document.getElementById('mycheckbox').checked){
        console.log('You Are Subscribed!!!');
    }
    else{
        console.log('You Not Subscribed...');
    }
}
*/
//code for getting radio buttons
//store each in an const variable
const visaBtn = document.getElementById('cardbtn');
const masterBtn = document.getElementById('masterbtn');
const paypalBtn = document.getElementById('paypalbtn');
//retrieve the button pays, onclick event
document.getElementById('paybtn').onclick = function(){
    if(visaBtn.checked){
        console.log('You are paying with a Visa Card.');
    }else if(masterBtn.checked){
        console.log('You are paying with a Master Card.');
    }else if(paypalBtn.checked){
        console.log('You are paying with a Paypal');
    }else{
        console.log('Please select a radio button.');
    }
    //make sure buttons are grouped under the same class.
}