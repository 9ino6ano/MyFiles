//this is for the switch statement

let grade = 'A';
/*
switch(grade){
    case 'A':
        console.log('Outstanding Achievement.');
        break;
    case 'B':
        console.log('Merticullous Achievement.');
        break;
    case 'C':
        console.log('Supplementary Achievement.');
    break;
    case 'D':
        console.log('Moderate Achievement');
        break;
    case 'E':
        console.log('Achieved');
        break;
    case 'F':
        console.log('Not Achieved');
        break;
    default:
        console.log('Unrecognized Symbol');    
}
*/
//case against set of values
let pass = 30;

switch(pass){//SWITCH CONDITION WITH TRUE TO INCLUE TEST CONDITION OF TWO PASS >= X
    /*
    CASE PASS >= 90:
    */
    case 90:
        console.log('Outstanding Achievement.');
        break;
    case 80:
        console.log('Merticullous Achievement.');
        break;
    case 70:
        console.log('Supplementary Achievement.');
    break;
    case 60:
        console.log('Moderate Achievement');
        break;
    case 50:
        console.log('Achieved');
        break;
    case 40 :
        console.log('Not Achieved');
        break;
    default:
        console.log("FAILED")    
}
//1-AND [&&] Both condition must be true, OR [||]OPERATORS one of the conditions must be true
//useful for checking ranges,validation
//2-the NOT LOGICAL [!], USED TO REVERSE A CONDITIONS BOOLEAN VALUE (!(PASS > 95))
