import React from 'react';

const officeImage = 'https://via.placeholder.com/300x180.png?text=Office+Space';

const office = {
  name: 'Prime Business Center',
  rent: 55000,
  address: 'Hitech City, Hyderabad',
};

const officeList = [
  { name: 'Prime Business Center', rent: 55000, address: 'Hitech City, Hyderabad' },
  { name: 'Skyline Towers', rent: 72000, address: 'Banjara Hills, Hyderabad' },
  { name: 'Green Park Offices', rent: 48000, address: 'Madhapur, Hyderabad' },
  { name: 'Metro Business Hub', rent: 65000, address: 'Gachibowli, Hyderabad' },
];

function App() {
  return (
    <div>
      <h1>Office Space Rental App</h1>
      <img src={officeImage} alt="office space" width="300" />

      <h2>Featured Office</h2>
      <p>Name: {office.name}</p>
      <p>Rent: {office.rent}</p>
      <p>Address: {office.address}</p>

      <h2>All Office Spaces</h2>
      <ul>
        {officeList.map((item, index) => (
          <li key={index}>
            {item.name} - {item.address} -{' '}
            <span style={{ color: item.rent < 60000 ? 'red' : 'green' }}>
              Rent: {item.rent}
            </span>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
