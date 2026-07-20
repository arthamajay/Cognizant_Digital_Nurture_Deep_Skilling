import React from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

// Way 4: switch-case based conditional rendering (component selector)
function renderComponent(type) {
  switch (type) {
    case 'book':
      return <BookDetails available={true} />;
    case 'blog':
      return <BlogDetails published={true} />;
    case 'course':
      return <CourseDetails enrolled={true} />;
    default:
      return <p>Nothing to display.</p>;
  }
}

function App() {
  return (
    <div>
      <h1>Blogger App</h1>
      <BookDetails available={true} />
      <BlogDetails published={false} />
      <CourseDetails enrolled={true} />

      <h2>Rendered via switch-case selector</h2>
      {renderComponent('blog')}
    </div>
  );
}

export default App;
