import React from 'react';
import EmployeeCard from './EmployeeCard';

const employees = [
  { id: 1, name: 'Ananya Rao' },
  { id: 2, name: 'Rahul Mehta' },
  { id: 3, name: 'Sneha Kapoor' },
];

function EmployeesList() {
  return (
    <div>
      <h2>Employee List</h2>
      {employees.map((emp) => (
        <EmployeeCard key={emp.id} employee={emp} />
      ))}
    </div>
  );
}

export default EmployeesList;
