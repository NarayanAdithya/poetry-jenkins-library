<h1 align="center">About</h1>

The repository houses custom groovy scripts to be used in Jenkins Multibranch Pipeline projects that deal with Python managed using Poetry . The functions deal with setting up python environment using poetry and running basic checks like linting, bandit vulnerability tests etc.

<h1 align="center"> Functions </h1>

<table align="center">
<thead>
<th>S.No</th>
<th>Function</th>
<th>Description</th>
<th>Arguments</th>
</thead>
<tbody>

<tr>
  <td>1</td>
  <td>poetryInstall()</td>
  <td>Creates .venv and Installs Dependencies</td>
  <td>-</td>
</tr>
<tr>
  <td>2</td>
  <td>poetryLint()</td>
  <td>Linting with flake8</td>
  <td>-</td>
</tr>
<tr>
  <td>3</td>
  <td>poetryBandit()</td>
  <td>Bandit Security Check</td>
  <td>-</td>
</tr>
<tr>
  <td>4</td>
  <td>poetryTest()</td>
  <td>Runs Pytest</td>
  <td>-</td>
</tr>
<tr>
  <td>5</td>
  <td>poetryBump()</td>
  <td>Makes Patch Update on version</td>
  <td>-</td>
</tr>
</tbody>
</table>
