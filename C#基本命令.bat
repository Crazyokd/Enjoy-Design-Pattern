@REM https://docs.microsoft.com/en-us/dotnet/core/tutorials/with-visual-studio-code?pivots=dotnet-6-0
@REM dotnet new console [--framework net6.0]

@REM 默认以Debug的方式运行
dotnet run

@REM //以版本模式运行
@REM dotnet run --configuration Release

@REM 发布
@REM dotnet publish --configuration Release

@REM 运行发布程序
@REM dotnet project_name.dll



@REM 创建一个solution
@REM dotnet new sln

@REM create a class library project
@REM the -o command specifies the location to place the generated output
@REM dotnet new classlib -o StringLibrary

@REM add the library project to the solution
@REM dotnet sln add StringLibrary/StringLibrary.csproj

@REM build the solution and verify that the project compiles without error.
@REM dotnet build 

@REM create the console app project 
@REM dotnet new console -o ShowCase

@REM add the console app project to the solution
@REM dotnet sln add ShowCase\ShowCase.csproj 

@REM create a project reference to the class library project 
@REM dotnet add ShowCase/ShowCase.csproj reference StringLibrary/StringLibrary.csproj 

@REM run the app 
@REM dotnet run --project ShowCase\ShowCase.csproj 


@REM install the package
@REM dotnet add package package_name