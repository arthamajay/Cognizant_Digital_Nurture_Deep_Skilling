import React from 'react';
import { BrowserRouter as Router, Switch, Route, Link } from 'react-router-dom';
import Home from './Home';
import TrainersList from './TrainersList';
import TrainerDetails from './TrainerDetails';
import trainersMock from './TrainersMock';

function App() {
  return (
    <Router>
      <nav>
        <Link to="/">Home</Link> | <Link to="/trainers">Trainers</Link>
      </nav>
      <Switch>
        <Route exact path="/" component={Home} />
        <Route
          exact
          path="/trainers"
          render={() => <TrainersList trainers={trainersMock} />}
        />
        <Route path="/trainer/:id" component={TrainerDetails} />
      </Switch>
    </Router>
  );
}

export default App;
