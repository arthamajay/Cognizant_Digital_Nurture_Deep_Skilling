import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0,
      message: '',
      clicked: '',
    };
    this.increment = this.increment.bind(this);
    this.decrement = this.decrement.bind(this);
    this.sayHello = this.sayHello.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
    this.onPress = this.onPress.bind(this);
  }

  increment() {
    this.setState((prevState) => ({ counter: prevState.counter + 1 }));
    this.sayHello();
  }

  decrement() {
    this.setState((prevState) => ({ counter: prevState.counter - 1 }));
  }

  sayHello() {
    this.setState({ message: 'Hello, this is a static message.' });
  }

  sayWelcome(name) {
    this.setState({ message: `Welcome, ${name}!` });
  }

  onPress(event) {
    // event here is a React SyntheticEvent
    this.setState({ clicked: 'I was clicked' });
  }

  render() {
    return (
      <div>
        <h1>Event Examples App</h1>
        <h2>Counter: {this.state.counter}</h2>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <p>{this.state.message}</p>

        <button onClick={() => this.sayWelcome('welcome')}>Say Welcome</button>

        <button onClick={this.onPress}>Press Me</button>
        <p>{this.state.clicked}</p>

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
