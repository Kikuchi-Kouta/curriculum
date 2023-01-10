//問１
let numbers = [2, 5, 12, 13, 15, 18, 22];

function isEven() {
    for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 === 0) {
            let num = numbers[i];
            console.log(num + 'は偶数です');
        }
    }
}
isEven(numbers);

//問２
class Car {
    constructor(gas, number) {
        this.gas = gas;
        this.number = number;
    }

        getNumGas() {
            console.log(`ガソリンは${this.gas}です。ナンバーは${this.number}です`);
        }
}

let prius = new Car('レギュラー', '12-34');
prius.getNumGas();