import React from 'react';

function CohortDetails({ cohort }) {
  if (!cohort) return null;
  return (
    <div>
      <h3>Cohort Code: {cohort.cohortCode}</h3>
      <p>Technology: {cohort.technology}</p>
      <p>Start Date: {cohort.startDate}</p>
      <p>Status: {cohort.status}</p>
    </div>
  );
}

export default CohortDetails;