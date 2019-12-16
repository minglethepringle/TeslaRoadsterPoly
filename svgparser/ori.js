var stdin = process.openStdin();
stdin.addListener("data", function(d) {
  d = d.toString().trim();
  console.log("\n");
  const {parseSVG, makeAbsolute} = require('svg-path-parser');
  const commands = parseSVG(d);
  // makeAbsolute(commands); // Note: mutates the commands in place!
  console.log(commands);
});