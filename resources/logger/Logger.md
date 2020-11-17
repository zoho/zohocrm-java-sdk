# Logger

This class represents the Logger level and log file path.

## Package com.zoho.api.logger

## Static Methods

| Return Type      | Method       | Description                                                |
| :--------------- | :----------- | :--------------------------------------------------------- |
| ***[Logger](../../src/main/java/com/zoho/api/logger/Logger.java)*** | getInstance(***[Levels](#levels)*** level, ***String*** filePath) | Creates a Logger class instance with the specified log level and file path. |
----

### Levels

- OFF
- FINE
- FINEST
- WARNING
- ALL
- FINER
- CONFIG
- INFO
- SEVERE

### filePath

A String representing the Absolute file path where messages need to be logged.

## Methods

| Return Type  | Method        | Description                                   |
| :----------- | :------------ | :-------------------------------------------- |
| ***String*** | getLevel()    | The getter method to get the logger level.  |
| ***String*** | getFilePath() | The getter method to get log the file path. |
----

[source](../../src/main/java/com/zoho/api/logger/Logger.java)
