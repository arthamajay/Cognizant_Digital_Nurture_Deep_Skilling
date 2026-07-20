import React from 'react';

const players = [
  { name: 'Player1', score: 85 },
  { name: 'Player2', score: 45 },
  { name: 'Player3', score: 92 },
  { name: 'Player4', score: 60 },
  { name: 'Player5', score: 30 },
  { name: 'Player6', score: 75 },
  { name: 'Player7', score: 55 },
  { name: 'Player8', score: 20 },
  { name: 'Player9', score: 68 },
  { name: 'Player10', score: 40 },
  { name: 'Player11', score: 95 },
];

function ListofPlayers() {
  const playerNames = players.map((player) => `${player.name}: ${player.score}`);
  const lowScorers = players.filter((player) => player.score < 70).map((player) => player.name);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {playerNames.map((p, index) => (
          <li key={index}>{p}</li>
        ))}
      </ul>
      <h3>Players with scores below 70</h3>
      <p>{lowScorers.join(', ')}</p>
    </div>
  );
}

export default ListofPlayers;
