import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: '',
      euro: null,
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({ rupees: event.target.value });
  }

  handleSubmit() {
    const conversionRate = 0.011; // approximate INR to EUR rate
    const euroValue = (parseFloat(this.state.rupees) * conversionRate).toFixed(2);
    this.setState({ euro: euroValue });
  }

  render() {
    return (
      <div>
        <h2>Currency Convertor</h2>
        <input
          type="number"
          placeholder="Enter amount in Rupees"
          value={this.state.rupees}
          onChange={this.handleChange}
        />
        <button onClick={this.handleSubmit}>Convert</button>
        {this.state.euro !== null && (
          <p>{this.state.rupees} INR = {this.state.euro} EUR</p>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;
