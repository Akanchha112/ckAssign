// // const original = { name: "Alice", details: { age: 25 } };
// // const copy = { ...original };

// // copy.name = "Bob";
// // copy.details.age = 30;

// // console.log(original.details.age); // 30 → nested object shared

// // console.log(original.name);


// const original = { name: "Alice" };
// const copy = { ...original };

// copy.name = "Bob";
// // copy.details.age = 30;

// // console.log(original.details.age); // 30 → nested object shared

// console.log(original.name);
// console.log(copy.name);





// const arr=[1,[2]];
// const copya=[...arr];
// console.log(arr);
// copya[1][0]=3;
// copya[0]=4;

// console.log(copya);
// console.log(arr);

// let count=2;
// const a=()=>{
//     count=3;
//     count++;
//     const z=0;
//     // z=;
//     console.log(z);
    
//     console.log(count);
// }
// a();
// console.log(b);

// var b=10
// console.log(b);
// var b=20;
// console.log(b);
// b=40;
// console.log(b);


const data = {
  name: "John",
  age: 30,
  hobbies: ["reading", "coding", "hiking"],
  address: {
    city: "New York",
    zip: "10001",
  },
};

console.log(data.address);
const {
  name,
  age,
  hobbies: [firstHobby, secondHobby], // Destructuring array inside object
  address: { city, zip },   // Destructuring nested object
} = data;

console.log(data.address);

