const blackFridayCart = {
    phone: 350,
    console: 250,
    tv: 450,
    headPhones: 10.60,
    watch: 20.34,
    bag: 22.36
};

function getCartValue(blackFridayCart, sum) {

    var sum = blackFridayCart.phone + blackFridayCart.console + blackFridayCart.tv + blackFridayCart.headPhones + blackFridayCart.watch + blackFridayCart.bag

    return sum;
}

console.log(getCartValue(blackFridayCart))
