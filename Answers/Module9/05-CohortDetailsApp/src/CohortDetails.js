import React from 'react';
import styles from './CohortDetails.module.css';

const cohorts = [
  { name: 'Cognizant DN 5.0 - Java Full Stack', status: 'ongoing', trainer: 'A. Sharma' },
  { name: 'Cognizant DN 5.0 - React Basics', status: 'completed', trainer: 'R. Iyer' },
  { name: 'Cognizant DN 5.0 - Spring Boot', status: 'ongoing', trainer: 'K. Verma' },
];

function CohortDetails() {
  return (
    <div>
      {cohorts.map((cohort, index) => (
        <div className={styles.box} key={index}>
          <h3 style={{ color: cohort.status === 'ongoing' ? 'green' : 'blue' }}>
            {cohort.name}
          </h3>
          <dl>
            <dt>Status</dt>
            <dd>{cohort.status}</dd>
            <dt>Trainer</dt>
            <dd>{cohort.trainer}</dd>
          </dl>
        </div>
      ))}
    </div>
  );
}

export default CohortDetails;
