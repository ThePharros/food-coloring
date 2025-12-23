# Food Coloring
A plugin that recolors cooked Sailing and Hunter foods to have a bit more (colorful) soul to them!

I've also added a yellow stripe to the raw and cooked Marlin, and made the cooked Halibut a lighter tint to be more in-line with its combo food predecessor Karambwan and to be less visually confused with Anglerfish.

Note: I left the new squids unaffected for now as I feel both actually do a solid job. I may still add new sprites for them down the road if there is enough demand for it though. 

Each affected food item can be toggled in the config options.

## Before and After
![beforeafter.png](src%2Fmain%2Fresources%2Fbeforeafter.png)

### Known Issues

* Some inventory-locked interfaces show full opacity rather than partial.

* The sprites used for banknotes of targeted foods aren't perfect due to bicubic scaling. One fix would be doubling the sprites of the plugin and refactoring code, although this isn't within my planned scope and I think the scaling algorithm does a good enough job.

* Some interfaces may have been missed. If you detect any that the plugin is ignoring, please let me know!