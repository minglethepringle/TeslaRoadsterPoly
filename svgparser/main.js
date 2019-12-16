var stdin = process.openStdin();
stdin.addListener("data", function(d) {
  d = d.toString().trim();
  console.log("\n");
  const {parseSVG, makeAbsolute} = require('svg-path-parser');
  const commands = parseSVG(d);
  makeAbsolute(commands); // Note: mutates the commands in place!
  var xArr = [], yArr = [];
  for(var i = 0; i < commands.length; i++) {
      var obj = commands[i];
      xArr.push(parseInt(obj.x));
      yArr.push(parseInt(obj.y));
  }
  var xRand = randChar();
    if (Number(xRand.charAt(0)) != NaN) xRand = "a" + xRand;
  var yRand = randChar();
    if (Number(yRand.charAt(0)) != NaN) yRand = "a" + yRand;
  console.log("g2.setColor();");

  console.log(`int[] ${xRand}Xs = new int[]{${JSON.stringify(xArr).split("[")[1].split("]")[0]}};`);
  console.log(`int[] ${yRand}Ys = new int[]{${JSON.stringify(yArr).split("[")[1].split("]")[0]}};`);
  console.log(`g2.drawPolygon(${xRand}Xs, ${yRand}Ys, ${xRand}Xs.length);`)
  console.log("-------------------------------------\n");
});

function randChar() {
  return Math.random().toString(36).substring(2, 7);
}

