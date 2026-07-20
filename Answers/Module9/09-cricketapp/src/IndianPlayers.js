import React from 'react';

function IndianPlayers() {
  const oddEvenTeams = ['Team A', 'Team B'];
  const [oddTeam, evenTeam] = oddEvenTeams;

  const T20players = ['Rohit', 'Virat', 'Bumrah'];
  const RanjiTrophyPlayers = ['Pujara', 'Rahane', 'Ashwin'];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Indian Players</h2>
      <p>Odd Team Player Group: {oddTeam}</p>
      <p>Even Team Player Group: {evenTeam}</p>
      <h3>Merged Squad (T20 + Ranji Trophy)</h3>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
