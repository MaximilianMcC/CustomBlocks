# Custom Blocks
Allows players to add their own custom blocks to the game. This is done using a very simple `.json` file and the textures for the block.

## Todo
- [x] Setup mod
- [x] Load/create block settings JSON
- [x] Parse block settings JSON
- [ ] Create blocks from the JSON
- [ ] Add textures and properties from the JSON
- [ ] Blocks path can be changed (something with modmenu mod)

## Upcoming features
- Ability to change the path where the the custom blocks are stored

# Creating a block
To create a block you first must open the `blocks.json` file. This is located in `.minecraft/mods/CustomBlocks/blocks.json` unless you have changed it. Open this file with any text editor. It should look something like this:
```json
[
	
]
```
Here is an example of how to add a block:
```json
[
	{
		"name": "My First Block",
		"texture: "./texture.png"
	}
]
```
The texture for the block is located in the same folder as `blocks.json`. It is a normal minecraft block texture.