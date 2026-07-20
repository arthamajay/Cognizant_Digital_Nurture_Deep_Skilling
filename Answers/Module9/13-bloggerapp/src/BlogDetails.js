import React from 'react';

// Way 2: ternary operator conditional rendering
function BlogDetails({ published }) {
  return (
    <div>
      <h3>Blog Details</h3>
      {published ? (
        <p>This blog post is live: "Getting Started with React Hooks"</p>
      ) : (
        <p>This blog post is still a draft.</p>
      )}
    </div>
  );
}

export default BlogDetails;
