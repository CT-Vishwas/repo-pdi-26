import { add, subtract} from './utils.js';
const calculateButton = document.getElementById('calculateButton');
function handleOnclick(){
    let num1 = parseInt(document.getElementById('num1').value) ;
    let num2 = parseInt(document.getElementById('num2').value) ;
    let op = document.getElementById('op').value;
    console.log('The Calculation');
    let res = document.getElementsByTagName('p')[0];

    let result = 0;
    switch (op) {
        case '+':
            result = add(num1, num2);
            res.textContent = `The Sum of ${num1} and ${num2} is ${result}`;      
            break;
        case '-':
            result = subtract(num1,num2);
            res.textContent = `The Subtraction of ${num1} and ${num2} is ${result}`;      
            break;
        case '*':
            res.textContent = `The Multiplication of ${num1} and ${num2} is ${num1 * num2}`;      
            break;
        case '/':
            if (num2 != 0){
                res.textContent = `The Division of ${num1} and ${num2} is ${num1 / num2}`;
            }
            else{
                res.textContent = `The Division of ${num1} and ${num2} cannot be performed`;
            }
            break;
        default:
            break;
            alert("The Answer is submitted");
    }
}
calculateButton.addEventListener('click', handleOnclick );