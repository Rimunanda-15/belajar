//Arithmatic operators

let a = 24
let b = 6

console.log(a + b)  //tambah
console.log(a - b)  //kurang
console.log(a * b)  //kali
console.log(a / b)  //bagi
console.log(a % b ) //modulus(sisa bagi)
console.log(a ** b) //eksponensial
console.log(a++ ) //increment + 1
console.log(a-- ) //deccrement - 1

//Comparison operators

const x = 10
const y = 12

console.log(x < y)    //kurang dari  
console.log(x <= y)    //kurang dari sama dengan  
console.log(x > y)    //lebih dari 
console.log(x >= y)    //lebih dari sama dengan
console.log(x != y)   //not equals
console.log(x == y)   //shallow equals
console.log(x === y)  //deep/strict equals
console.log(!y)       //not

//Exercise
let panjang = 5
let lebar = 6 
let luas = panjang * lebar
let panjang2 = 4
let lebar2 = 5
let luas2 = panjang2 * lebar2
console.log("Luas persegi panjang 1: "+luas)
console.log("Luas persegi panjang 2: "+luas2)
console.log("Apakah luas persegi panjang 1 lebih dari yang ke 2? " + (luas > luas2))

const phi = 3.14
let jari2 = 7
let luasLingkaran = phi * (jari2*jari2)
let kelilingLingkaran = phi * (jari2+jari2)
console.log("Luas Lingkaran: " + luasLingkaran + "cm2")
console.log("Keliling Lingkaran: " + kelilingLingkaran + "cm")
