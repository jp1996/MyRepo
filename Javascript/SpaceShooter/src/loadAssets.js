export function loadAssets(k) {
    k.loadSpriteAtlas("./assets/sprites/sprites.png", {
        ship: { x: 0, y: 0, width: 16, height: 16, sliceX: 0, sliceY: 0},
        background: { x: 16, y: 16, width: 16, height: 16, sliceX: 0, sliceY: 0},
        laser: { x: 32, y: 0, width: 16, height: 16, sliceX: 0, sliceY: 0},
        enemy: { x: 16, y: 0, width: 16, height: 16, sliceX: 0, sliceY: 0},
        bullet: { x: 0, y: 16, width: 16, height: 16, sliceX: 0, sliceY: 0},
    });

    k.loadFont("press2p", "./assets/fonts/PressStart2P-Regular.ttf");

    k.loadSound("laser", "./assets/sfx/laser.wav");
    k.loadSound("bullet", "./assets/sfx/bullet.wav");
    k.loadSound("explode", "./assets/sfx/explode.wav");

    k.loadSound("bg", "./assets/music/Groove1.ogg");
}