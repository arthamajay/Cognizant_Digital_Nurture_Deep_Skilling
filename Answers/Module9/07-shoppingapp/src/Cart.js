import React, { Component } from 'react';

class Cart extends Component {
  constructor(props) {
    super(props);
    this.itemname = props.itemname;
    this.price = props.price;
  }

  render() {
    return (
      <tr>
        <td>{this.itemname}</td>
        <td>{this.price}</td>
      </tr>
    );
  }
}

export default Cart;
