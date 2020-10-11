# Gradle IDEA

## Getting Started

### Create Gradle project

- File/New/Project...
- Select Gradle
- Select Project SDK
- Check 'Additional Libraries and Frameworks'
  - Select Java
- Click Next and follow instructions

### Configure .gitignore

Just copy .gitignore from this project

### Enable running from command line

- in plugins section add: `id 'application'`
- at the bottom add: `mainClassName = 'path.to.app.AppName'`
  - in this Hello project that would be: `mainClassName = 'IdeaGradleHello'`

### Build project

`$ gradle build`

### Run project

`$ gradle run`

If you use Scanner use following command to remove ugly prompt:
`$ gradle --console plain run`

## References

- [Maven repository](https://mvnrepository.com/)
