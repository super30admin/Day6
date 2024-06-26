def longestPalindrome(s: str) -> int:
    char_count = {}

    for char in s:
        if char in char_count:
            char_count[char] += 1
        else:
            char_count[char] = 1

    string_size = 0
    atleast_one_odd = False
    for key, value in char_count.items():

        if value % 2 == 0:
            string_size += value
        else:
            string_size += value - 1
            atleast_one_odd = True

    return string_size + 1 if atleast_one_odd else string_size


def main():
    s = "abccccdd"
    print(longestPalindrome(s))


if __name__ == '__main__':
    main()
