import React, { useContext } from 'react';
import ThemeContext from './ThemeContext';

function EmployeeCard({ employee }) {
  const theme = useContext(ThemeContext);

  const style = {
    backgroundColor: theme === 'dark' ? '#333' : '#fff',
    color: theme === 'dark' ? '#fff' : '#000',
    border: '1px solid #999',
    padding: '10px',
    margin: '8px 0',
  };

  return (
    <div style={style}>
      <p>{employee.name}</p>
    </div>
  );
}

export default EmployeeCard;
