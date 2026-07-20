import React from 'react';

// Way 3: logical && operator and element variables
function CourseDetails({ enrolled }) {
  let courseInfo;
  if (enrolled) {
    courseInfo = <p>You are enrolled in "React JS Fundamentals".</p>;
  } else {
    courseInfo = null;
  }

  return (
    <div>
      <h3>Course Details</h3>
      {courseInfo}
      {!enrolled && <p>You have not enrolled in any course yet.</p>}
      {enrolled && <p>Keep up the great work!</p>}
    </div>
  );
}

export default CourseDetails;
