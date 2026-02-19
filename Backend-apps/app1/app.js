// Simple Interest Calculator
import * as readline from 'node:readline/promises';
import { stdin as input, stdout as output } from 'node:process';

const rl = readline.createInterface({input, output});
// principal = 300000;
// timeInMonths = 36;
// rateOfInterest = 0.07;

const principal = await rl.question('Enter the Principal amount: '); 
const rateOfInterest = await rl.question('Enter the rate of interest: ');
const timeInMonths = await rl.question('Enter the Time in Months: ');
rl.close();

let simpleInterest = principal * rateOfInterest * timeInMonths / 100;


console.log(`Simple interest for ${principal} at ${rateOfInterest} for the duration ${timeInMonths} months is ${(simpleInterest).toFixed(2)}`);

