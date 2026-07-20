import React, { Component } from 'react';
import Cart from './Cart';

class OnlineShopping extends Component {
  constructor(props) {
    super(props);
    this.cartItems = [
      { itemname: 'Laptop', price: 55000 },
      { itemname: 'Mobile', price: 20000 },
      { itemname: 'Headphones', price: 1500 },
      { itemname: 'Keyboard', price: 800 },
      { itemname: 'Monitor', price: 9500 },
    ];
  }

  render() {
    return (
      <div>
        <h1>Online Shopping Cart</h1>
        <table border="1" cellPadding="8">
          <thead>
            <tr>
              <th>Item Name</th>
              <th>Price</th>
            </tr>
          </thead>
          <tbody>
            {this.cartItems.map((item, index) => (
              <Cart key={index} itemname={item.itemname} price={item.price} />
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default OnlineShopping;
