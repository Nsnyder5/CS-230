# CS-230
Project Reflection: Draw It or Lose It
The Gaming Room Client & Software Requirements

The Client: The client for this project is The Gaming Room, a company seeking to broaden the availability of their gaming services.


Software Design: The primary objective was to transition their existing Android-based game, "Draw It or Lose It," into a web-based application.


Requirements: I designed the system to support users across multiple platforms, including Windows, Mac, and Mobile devices. A critical requirement was maintaining a single, consistent game state in server memory to prevent duplicate games, players, or teams. This centralized state also ensures that unique naming conventions are enforced throughout the application.

Documentation Strengths

Design Pattern Integration: I effectively demonstrated how the Singleton and Iterator patterns solve specific technical challenges, such as global state management and safe collection traversal.


Platform Evaluation: The documentation includes a comprehensive comparison of operating systems—Linux, Windows, and macOS—alongside mobile devices, evaluating them holistically for both server-side hosting and client-side accessibility.


UML Modeling: I created a UML class diagram that clearly maps out the hierarchy and relationships between the GameService, Game, Team, and Player entities, emphasizing Object-Oriented principles like inheritance.

Design Document Utility in Development

Visualizing Relationships: Developing the Domain Model was a helpful step for visualizing how the GameService acts as the root manager for all other objects in the system.


Identifying Constraints: By analyzing design constraints like concurrency and memory management early in the process, I could anticipate issues like ConcurrentModificationException and design the code to handle multiple simultaneous users.


Standardizing Tools: Establishing the use of cross-platform IDEs, such as Eclipse or VS Code, ensured a unified and efficient development workflow for the team.

Future Revisions & Improvements

Database Schema: While the current document recommends a Relational Database Management System (RDBMS), a future revision could include a detailed entity-relationship diagram (ERD) to map exactly how the Entity attributes, such as ID and name, are persisted in specific SQL tables.


Security Specifics: I would expand on the security section by detailing specific TLS/HTTPS implementation steps or user authentication flows beyond the general mention of encryption and encapsulation.

Interpreting & Implementing User Needs

Needs Interpretation: I interpreted the client’s need for "multi-platform access" by designing a client-server architecture where the server remains the authoritative host.


Implementation: To meet mobile user needs, I focused on a responsive HTML interface utilizing modern techniques like CSS Flexbox and Grid, which allows the game to adapt to various screen sizes without requiring native code for each device.


User-Centric Design: Considering user needs is vital because it ensures the software remains accessible regardless of hardware and provides a synchronized experience for a geographically dispersed player base.

Software Design Approach & Future Strategies

Methodology: My approach involved evaluating operating system architectures, such as monolithic kernels for the Linux server, and aligning them with application-level design patterns to maximize performance.


Future Techniques: In future projects, I will continue to utilize industry-standard platforms like Linux for its proven scalability, security, and high performance.


Strategic Analysis: I will prioritize Object-Oriented Programming (OOP) principles, such as using a shared Entity base class, to reduce code duplication and improve the long-term maintainability of the software.
