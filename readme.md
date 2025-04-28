# Spring MCP Server(SSE)

## To Run

1- `./gradlew bootRun`  This will start the server on port 8080 by default. <br />
2- Add MCP Configuration <br />
VSCode Example:
```json
{
  "mcp": {
    "servers": {
      "tresende-mcp-server": {
        "type": "sse",
        "url": "http://localhost:8080/sse"
      }
    }
  }
}
```
<br />
<img width="399" alt="image" src="https://github.com/user-attachments/assets/7c282613-5dbe-406d-86c7-eced4aa8f676" />
<br />

