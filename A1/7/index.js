let a;
let b;
let c;
/*
a = window.prompt('Enter Side A:');
a = Number(a);

a = window.prompt('Enter Side B:');
b = Number(b);

c = Math.pow(a,2) + Math.pow(b,2);
c = Math.sqrt(c);
//c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

console.log('[Side C] is: '+ c);
*/
//excepting input via html text boxes

document.getElementById('button').onclick = function(){
    a = document.getElementById('atext').value;
    a = Number(a);
    b = document.getElementById('btext').value;
    b = Number(b);

    c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    document.getElementById('labelc').innerHTML = "Side C is: " + c;
}