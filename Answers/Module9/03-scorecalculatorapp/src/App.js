import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore name="Pradeep" school="CVR College of Engineering" total={450} goal={500} />
    </div>
  );
}

export default App;
