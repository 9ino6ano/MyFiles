//creating the program
//my label retrieval
/*
const lbl = document.getElementById('mylabel');

updateTime();
setInterval(updateTime,1000);

function updateTime(){
    let date = new Date();
    lbl.innerHTML = formatTime(date);
    //using nested functions
    function formatTime(){
        let hours = date.getHours();
        let minutes = date.getMinutes();
        let seconds = date.getSeconds();
        //change from mil to stan
        let amOrPm = hours >= 12? "pm" : "am";
        hours = (hours % 12) || 12;
        //format the zeros
        //hours = formatZeros(hours);
        //minutes = formatZeros(minutes);
        //seconds = formatZeros(seconds);

        return `${hours} : ${minutes} : ${seconds} / ${amOrPm}`;
    }
    function formatZeros(time){
        time = time.toStirng();
        return time.length < 2 ? "0" + time : time;
    }
}
*/
/*
1.synchronous code = in an ordered sequence, step by step - linear instructions [start now finish now]
2.asynchronous code = out of sequence, random, e.g access to database/files , processing that takes time [start now finish later]
*/
console.log('1.Synchronous/Asynchronous Code');
/*

//console.log('@Start');
//console.log('[A]  This step is synchronous');
//console.log('[B]  The next synchronous step');
//console.log('@End');
console.log('These steps is Asynchronous');
console.log('#Start');
setTimeout(() => console.log('ASYNCASYNCASYNC'),7000);
console.log('#End');
*/
//TIME METHOD OF THE CONSOLE CLASS
console.log('2. console.time()');
//starts a timer you can use to track how long an opearation takes, give each timer a unique name
//start
console.time('Response Time');//sychronous methods
//alert('Click The OK Button');
setTimeout(() => console.log('Yashoo...'),7000);//asynchronouse methods
//end
console.timeEnd('Response Time');