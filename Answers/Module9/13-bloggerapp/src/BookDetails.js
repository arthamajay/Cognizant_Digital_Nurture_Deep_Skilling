import React from 'react';

// Way 1: if-else conditional rendering
function BookDetails({ available }) {
  if (available) {
    return (
      <div>
        <h3>Book Details</h3>
        <p>"Clean Code" by Robert C. Martin is available.</p>
      </div>
    );
  } else {
    return (
      <div>
        <h3>Book Details</h3>
        <p>Sorry, this book is currently unavailable.</p>
      </div>
    );
  }
}

export default BookDetails;
