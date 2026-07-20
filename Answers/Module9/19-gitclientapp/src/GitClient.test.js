import axios from 'axios';
import GitClient from './GitClient';

jest.mock('axios');

describe('Git Client Tests', () => {
  test('should return repository names for techiesyed', async () => {
    const dummyRepos = {
      data: [
        { name: 'appscentricsolutions' },
        { name: 'ArrayListDemo' },
        { name: 'ArrayListDemo01' },
      ],
    };

    axios.get.mockResolvedValue(dummyRepos);

    const result = await GitClient.getRepositories('techiesyed');

    expect(axios.get).toHaveBeenCalledWith(
      'https://api.github.com/users/techiesyed/repos'
    );
    expect(result.data).toEqual(dummyRepos.data);
    expect(result.data.length).toBe(3);
  });
});