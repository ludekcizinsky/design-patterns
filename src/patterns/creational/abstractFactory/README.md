## Description
Make sure that particular subclasses are instantiated together. For instance, if you have a system that can run on several types of devices (e.g. Mac, Windows), then
you can separate the GUI initilization this way as the [simple example](SimpleExample.java) shows.

## Pros and Cons
The pros would are:
- it helps you to ensure that the right combination of classes get instantiated together. Therefore, avoids a situation where you have Mac like buttons with Windows colors.
- easy to switch to different theme e.g. old and new Mac GUI

The cons are:
- it makes the inilization process a bit unnatural