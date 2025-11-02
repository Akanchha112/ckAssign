// 1. Convert to Arrow Function
const add=(a,b)=>{
    return a+b;
}
console.log("1. Arrow funciton : ", add(2,9));


// 2. Default Parameters
function greet(name,message="Welcome!"){
    console.log('2. Default Parameters: ',message,', ',name);
}
greet("Akanchha","Hiii!");


// 3. Template Literals
const formatString=(name,age)=>{
    console.log(`3. Hello, my name is ${name} and I am ${age} years old`)
}
formatString("Akanchha",23);

// 4. Object Destructuring
const destructuring=(obj)=>{
    const {name,age,address:{city,country}}=obj;
    console.log(`4. ${name} lives in ${city}`);
    console.log(city,country);
    
}
destructuring({
    name: 'Alice',
    age: 25,
    address: {
        city: 'New York',
        country: 'NY'
    }
})


// 5. Rest Operator
const sumAll=(...rest)=>{
    let sum=0;
    rest.forEach(element => {
        sum+=element;
    });
    console.log(`5. Sum All: ${sum}`);
    
}
sumAll(2,4,5,6,7,6);
sumAll(34,6,7,9,6,4,3,3,5,9,8,0);



// 6. Filter Even Numbers
const filterEvens=(arr)=>{
    const even= arr.filter((num)=> num%2==0);
    console.log("6. Filtered Even numbers: ",even);
    
}
filterEvens([2,5,6,8,9,55,67,78]);


// 7. Array Mapping
const doubleValues=(arr)=>{
    return arr.map((v)=>{
        return v*2;
    })
    
}
console.log( "7. Double array: ", doubleValues([3,7,6]))


// 8. Find the Maximum
const findMax = (arr) => {
  return Math.max(...arr);
};

console.log("8. Largest Number: ",findMax([3, 5, 7, 2, 8]));



// 9. Object and Array Destructuring
const data =[
  {
    name: "Bob",
    age: 24
  },
  {
    name: "Alice",
    age: 21
  }
]

const objDes=(data)=>{
    const[{age},{name}]=data;
    console.log(`9. Object and Array Destructuring: ${name} is ${age}`);
}
objDes(data);


// 10. Data Manipulation using Array functions
const input=
[{
"id": 1,
"title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
"price": 109.95,
"description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
"category": "men's clothing",
"image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
"rating": {
"rate": 3.9,
"count": 120
}
}]


const manipulation=(arr)=>{
    return arr.map((ele)=>{
        return {id:ele.id, ritle:ele.title, rate:ele.rating.rate, count:ele.rating.count};
    })
}
console.log("10. Data Manipulation using Array functions: ",manipulation(input));


// 11. Default Parameter
const fun = (name = "abc") => {
        if (name) {
          console.log("if", name);
        } else {
          console.log("else", name);
        }
      };
	  
fun(""); 


// 12. Deep Clone Objects
const iterateKeys = (obj) => {
    let newobj={};
  for (const key in obj) {
    if (typeof obj[key] === "object" && obj[key] !== null) {
      
      newobj[key] = iterateKeys(obj[key]);
    } else {
      newobj[key] =obj[key];
    //   console.log(`${key}: ${obj[key]}`);
    }
  }
  return newobj;
};
const deepClone = (obj) => {
  return iterateKeys(obj);
};

const obj = { a: 1, b: { c: 2 } };

const cloned = deepClone(obj);
console.log("Original:", obj);
console.log("Cloned:", cloned);





// 13. Flatten Nested Arrays
arr=[1,[2,[3,[4]]]]
function flatten(array) {
  let result = [];
  for (const el of array) {
    if (Array.isArray(el)) {
      result = result.concat(flatten(el));
    } else {
      result.push(el);
    }
  }
  return result;
}

console.log(flatten(arr));



