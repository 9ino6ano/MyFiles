//the button to convert temperature
document.getElementById('submitBtn').onclick = function(){
    let temp;
    let f = document.getElementById('FButton');
    let c = document.getElementById('CButton');
    let disp = document.getElementById('lblDisplay');

    if(c.checked){
        c = document.getElementById('textBox').value;
        c = Number(c);
        c = toCelsius(c);
        document.getElementById('lblDisplay').innerHTML = c + "°C";//the degress function = alt + 0176
    }
    else if(f.checked){
        f = document.getElementById('textBox').value;
        f = Number(f);
        f = toFerenheit(f);
        document.getElementById('lblDisplay').innerHTML = f + "°F";//the degress function = alt + 0176
    
    }
    else{
        document.getElementById('lblDisplay').innerHTML = 'select a unit';
    }

}



//The practice program for coverting from different temperatures
//always create the logic behind functions before HTMl
let temp = 32;
let ctemp = toCelsius(temp);
let ftemp = toFerenheit(temp);
console.log('The Temperature Coverter of ',temp)
console.log('Temperature in degrees Celsius ',ctemp);
console.log('The Temperature in degrees Ferenheit',ftemp);

function toCelsius(Ctemperature){
    return (Ctemperature -32) * (5/9);
}
function toFerenheit(Ftemperature){
    return Ftemperature * 9/5 + 32;
}