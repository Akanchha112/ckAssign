const cardContainer=document.getElementById('cardContainer');
cardContainer.style.display='flex';
cardContainer.style.justifyContent='space-around';
cardContainer.style.alignItems='center';
cardContainer.style.flexWrap = 'wrap'; 


//Q1 Display a list of at least 4 products (name, price, and category) as cards, Use JavaScript to dynamically create and insert all HTML elements
function createCard(element){
    let a=document.createElement('div');
    const heading=document.createElement('h3');
    heading.innerHTML=`<strong>Name:</strong> ${element.name}`;
    const price=document.createElement('p');
    price.innerHTML=`<strong>Price:</strong> ${element.price}`;
    const category=document.createElement('p');
    category.innerHTML=`<strong>Category:</strong> ${element.category}`;
    const discount=document.createElement('p');
    // discount.setAttribute('id', 'discountPrice');
    discount.innerHTML=`<strong>Discount:</strong> ${element.discountedprice}`;

    a.append(heading);
    a.append(price);
    a.append(category);
    a.append(discount);

    a.style.width='200px';
    a.style.padding="20px";
    a.style.border="2px solid #d7d7d7ff";
    a.style.boxShadow="10px 5px 30px 10px #ccccccff";
    a.style.margin="10px"
    a.style.borderRadius="12px";

    //Q5 When hovering over a product, highlight it (use mouse events).
    a.style.transition = 'transform 0.3s ease';
    a.addEventListener('mouseover',()=>{
        a.style.width='220px';
        a.style.transform='scale(1.1)';
    })
    a.addEventListener('mouseout', () => {
        a.style.transform = 'scale(1)';
    });
    cardContainer.append(a);
}


function AddItem(name,price,category,discountedprice){
    this.name=name;
    this.price=price;
    this.category=category;
    this.discountedprice=discountedprice;
}

//Q3 Add a prototype method to Product called getDiscountedPrice(percent) that returns discounted value.
AddItem.prototype.getDiscountedPrice = function(percent){
    this.discountedprice=this.price-(this.price*percent)/100;
}

//Q2 Use a constructor function Product(name, price, category) to create product objects.
const product1=new AddItem("Cycle",100000,"Vehicle");
const product2= new AddItem("Cream",2000,"Cosmetics");
const product3= new AddItem("Pencil",20,"Stationary");
const product4=new AddItem("Pen",30,"Stationary");

const objArr=[];
objArr.push(product1);
objArr.push(product2);
objArr.push(product3);
objArr.push(product4);
console.log(objArr);



//Q4 Use an IIFE to initialize data or attach event listeners immediately after page load.
(function setData(){
    objArr.forEach(element => {
        element.getDiscountedPrice(12);
        createCard(element);
        // const discountele=document.getElementById('discountPrice');
        // discountele.innerHTML=`<strong>Category:</strong> ${element.discountedprice}`;
    });
}());



//Q6 Use call / apply / bind to get the costliest product price and display at the top (“price of costliest product is 1234”)
function getCostlierProduct(otherProduct) {
  return this.price > otherProduct.price ? this : otherProduct;
}


let costliest = getCostlierProduct.call(product1, product2);
costliest = getCostlierProduct.call(costliest, product3);
costliest = getCostlierProduct.call(costliest, product4);


const info = document.createElement('h2');
info.textContent = `Price of costliest product is ${costliest.price}`;
document.body.prepend(info);
