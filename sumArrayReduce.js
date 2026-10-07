let n = Number(prompt());
let arr = [];

for (let i = 0; i < n; i++) {
    arr.push(Number(prompt()));
}

let sum = arr.reduce((total, num) => total + num, 0);

console.log(sum);